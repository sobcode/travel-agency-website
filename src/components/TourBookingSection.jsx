import React from 'react'
import '../pages/Tour.css';

const TourBookingSection = () => {
  return (
    <main className="booking-now" id="targetDiv">
        <h1 className="booking-now__heading">Fill out the Form</h1>
        <div className="booking-now__wrapper">
          <form action="#" className="booking-now__form">
            <div className="name-inputs">
                <div className="firstname-input">
                    <label for="firstname">Firstname</label>
                    <input id="firstname" type="text"/>
                </div>
                <div className="lastname-input">
                    <label for="lastname">Lastname</label>
                    <input id="lastname" type="text"/>
                </div>
            </div>
            <div className="email-input">
                <label for="email">E-mail</label>
                <input type="email" id="email" placeholder="example@gmail.com"/>
            </div>
            <div className="number-input">
                <label for="number">Telephone Number</label>
                <input type="tel" id="number" required placeholder="380931377123"/>
            </div>
            <div className="card-number-input">
              <label for="card-number">Card Number</label>
              <input type="text" id="card-number"  placeholder="XXXX-XXXX-XXXX-XXXX"/>
          </div>
          <div className="card-detail-inputs">
            <div className="date-input">
                <label for="date">Date</label>
                <input id="date" type="text" placeholder="06/23"/>
            </div>
            <div className="cvv-input">
                <label for="cvv">Cvv</label>
                <input id="cvv" type="password" placeholder="123"/>
            </div>
        </div>
            <button type="submit">Book Tour</button>
      </form>
        </div>
      </main>
  )
}

export default TourBookingSection