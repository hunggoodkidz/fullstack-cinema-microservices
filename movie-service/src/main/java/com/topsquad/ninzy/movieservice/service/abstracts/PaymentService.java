package com.topsquad.ninzy.movieservice.service.abstracts;

import com.topsquad.ninzy.movieservice.entity.dto.TicketInformationDto;

public interface PaymentService {

    void sendTicketDetail(TicketInformationDto ticketInformationDto);
}
