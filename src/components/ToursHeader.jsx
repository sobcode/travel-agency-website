import React from 'react'
import '../pages/Tours.css';

const ToursHeader = () => {
  return (
    <section className="header__section">
            <div className="header__section__text">
                <h1 className="header__section__text__heading">Our Premium Tours and Voyages</h1>
                <p className="header__section__text__paragraph">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Volutpat elit sed pretium, egestas sed sit orem ipsum dolor sit amet</p>
            </div>
            <form className="header__sections__dropdowns">
                <input type="text" className="header__sections__dropdowns__input" placeholder="Search Tour..."/>
                <div className="header__sections__dropdowns__item">
                    <label htmlFor="guest">Visitors</label>
                    <select id="guest">
                      <option value="option1">1 Adult</option>
                      <option value="option2">2 Adult</option>
                      <option value="option3">3 Adult</option>
                    </select>
                </div>
                <div className="header__sections__dropdowns__item">
                      <label htmlFor="room">Tour Type</label>
                      <select id="room">
                        <option value="option1">Mountain</option>
                        <option value="option2">Sea</option>
                        <option value="option3">Jungles</option>
                      </select>
                </div>
                <div className="header__sections__dropdowns__item">
                  <label htmlFor="price">Price</label>
                  <select id="price">
                    <option value="option1">+-100$</option>
                    <option value="option2">+-1000$</option>
                    <option value="option3">+-10 000$</option>
                  </select>
                </div>
                <div className="header__sections__dropdowns__item">
                    <label htmlFor="sort">Sort By</label>
                    <select id="sort">
                      <option value="option1">Visitors</option>
                      <option value="option2">Tour Type</option>
                      <option value="option3">Price[lower to upper]</option>
                      <option value="option4">Price[upper to lower]</option>
                    </select>
                  </div>
                <button className="header__sections__search-btn" type="submit">Search Tour</button>
            </form>
          </section>
  )
}

export default ToursHeader