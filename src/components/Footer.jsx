import React from 'react'
import planeIcon from "../assets/img/paper-plane.svg";
import whiteLogo from '../assets/img/logo-white.svg';
const Footer = () => {
  return (
    <footer className="footer">
      <section className="footer__newsletter">
        <h3 className="footer__newsletter__heading">If you have any question, Let us help you!</h3>
        <p className="footer__newsletter__paragraph">Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
        <form  className="footer__newsletter__form">
          <input type="email" placeholder="Enter your e-mail"/>
          <button type="submit">
            <img src={planeIcon} alt="paper plane"/>
          </button>
        </form>
      </section>
      <section className="footer__links">
        <div className="footer__links__logo">
          <img src={whiteLogo} alt="logoipsum"/>
        </div>
        <p className="footer__links__paragraph">Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
        <div className="footer__links__lists">
          <ul className="links__list">
            <li><a href="#">Home</a></li>
            <li><a href="#">Tour & Suites</a></li>
            <li><a href="#">Packages</a></li>
            <li><a href="#">Promo</a></li>
          </ul>
          <ul className="links__list">
            <li><a href="#">Home</a></li>
            <li><a href="#">Tour & Suites</a></li>
            <li><a href="#">Packages</a></li>
            <li><a href="#">Promo</a></li>
          </ul>
          <ul className="links__list">
            <li><a href="#">Home</a></li>
            <li><a href="#">Tour & Suites</a></li>
            <li><a href="#">Packages</a></li>
            <li><a href="#">Promo</a></li>
          </ul>
        </div>
      </section>
    </footer>
  )
}

export default Footer