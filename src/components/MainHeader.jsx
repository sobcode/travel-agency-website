import React from 'react'
import partnerLogo1 from '../assets/img/logo 1.svg';
import partnerLogo2 from '../assets/img/logo 2.svg';
import partnerLogo3 from '../assets/img/logo 3.svg';
import partnerLogo4 from '../assets/img/logo 4.svg';
import partnerLogo5 from '../assets/img/logo 5.svg';

import '../pages/Main.css';

const MainHeader = () => {
  return (
    <section>
    <section className="header__sections">
        <section className="header__left">
          <h1 className="header__left__heading">
            The world's largest chain of travel agencies is Best Western
          </h1>
          <p className="header__left__paragraph">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Volutpat elit
            sed pretium, egestas sed sit orem ipsum dolor sit amet
          </p>
          {/* <div className="header__left__random-tour">
              <div className="header__left__first-dropdown header__left__dropdown">
                  <label for="guest">Visitors</label>
                  <select id="guest">
                    <option value="option1">1 Adult</option>
                    <option value="option2">2 Adult</option>
                    <option value="option3">3 Adult</option>
                  </select>
              </div>
              <div className="header__left__second-dropdown header__left__dropdown">
                    <label for="room">Tour Type</label>
                    <select id="room">
                      <option value="option1">Mountain</option>
                      <option value="option2">Sea</option>
                      <option value="option3">Jungles</option>
                    </select>
              </div>
              <div className="header__left__third-dropdown header__left__dropdown">
                <label for="price">Price</label>
                <select id="price">
                  <option value="option1">+-100$</option>
                  <option value="option2">+-1000$</option>
                  <option value="option3">+-10 000$</option>
                </select>
              </div>
              <button className="header__left__btn">Booking Tour</button>
          </div> */}
        </section>
      </section>
      <section className="header__right"></section>
      <section className="header__partners">
        <ul className="header__partners__list">
          <li><img src={partnerLogo1} alt="partner-1"/></li>
          <li><img src={partnerLogo2} alt="partner-2"/></li>
          <li><img src={partnerLogo3} alt="partner-3"/></li>
          <li><img src={partnerLogo4} alt="partner-4"/></li>
          <li><img src={partnerLogo5} alt="partner-5"/></li>
        </ul>
      </section>
      </section>
  )
}

export default MainHeader