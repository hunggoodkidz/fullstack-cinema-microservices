package com.topsquad.ninzy.movieservice.service.concretes;

import com.topsquad.ninzy.movieservice.service.abstracts.PaymentService;
import com.topsquad.ninzy.movieservice.entity.dto.EmailMessageKafkaDto;
import com.topsquad.ninzy.movieservice.entity.dto.TicketInformationDto;
import com.topsquad.ninzy.movieservice.util.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaProducer kafkaProducer;

    @Override
    public void sendTicketDetail(TicketInformationDto ticketInformationDto) {

        EmailMessageKafkaDto emailMessage = EmailMessageKafkaDto.builder()
                .sender("cyborgmachinegun123@gmail.com")
                .recipient(ticketInformationDto.getEmail())
                .subtitle("CinemaHub Ticket Details")
                .fullName(ticketInformationDto.getFullName())
                .movieName(ticketInformationDto.getMovieName())
                .movieDay(ticketInformationDto.getMovieDay())
                .movieStartTime(ticketInformationDto.getMovieStartTime())
                .saloonName(ticketInformationDto.getSaloonName())
                .chairNumbers(ticketInformationDto.getChairNumbers())
                .build();

        kafkaProducer.sendMessage(emailMessage);
    }
}
