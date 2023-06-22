import React from 'react'
import '../pages/Tour.css';

const TourHeader = ({tour}) => {
  const price = tour.price.toFixed(2);

  const scrollToForm = () => {
    const targetDiv = document.querySelector("#targetDiv");
    targetDiv.scrollIntoView({ behavior: "smooth" });
  };
  return (
    <>
        <section className="header__sections">
            <section className="header__left">
              <h1 className="header__left__heading">
                {tour.title} 
              </h1>
              <p className="header__left__paragraph">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Volutpat elit
                sed pretium, egestas sed sit orem ipsum dolor sit amet
              </p>
              <ul className="header__left__features">
                <li className="header__left__tour-destination">{tour.destination}</li>
                <li className="header__left__tour-durability">{tour.durability} days</li>
                <li className="header__left__tour-rating">{tour.rating} / 5 <i className="fa-solid fa-star"></i></li>
            </ul>
            <div className="header__left__actions">
                <button className="header__left__booking-btn" id="scrollButton" onClick={scrollToForm}>Book Tour</button>
                <div className="header__left__price">
                    <p>Price</p>
                    <span>{price}$</span>
                </div>
            </div>    
        </section>
          </section>
          <section className="header__right"></section>
    </>
  )
}

export default TourHeader