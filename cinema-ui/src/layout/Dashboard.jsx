import React from 'react'
import { useSelector } from 'react-redux'
import { Route, Routes } from 'react-router-dom'
import BuyTicketPage from '../pages/BuyTicketPage'
import DetailPage from '../pages/DetailPage'
import MainPage from '../pages/MainPage'
import PaymnetSuccessPage from '../pages/PaymentSuccessPage'
import ErrorPage from '../utils/utilPages/ErrorPage'
export default function Dashboard() {

  const userFromRedux = useSelector(state => state?.user?.payload)

  return (
    <div> 
      <Routes>
        <Route path={"/"} element={<MainPage/>} />
        <Route path={"/movie/:movieId"} element={<DetailPage/>} />
        <Route path={"movie/:movieId/buyTicket"}  element={<BuyTicketPage/>} />       
        <Route path={"/paymentSuccess"}  element={<PaymnetSuccessPage/>} />



        <Route path='*' element={<ErrorPage />} />

      </Routes>

    </div>
  )
}
