import React from 'react'
import firstPhoto from '../assets/img/tour-img/grid-tour-1.jpg';
import secPhoto from '../assets/img/tour-img/grid-tour-2.jpg';
import thirdPhoto from '../assets/img/tour-img/grid-tour-3.jpg';
import fourthPhoto from '../assets/img/tour-img/grid-tour-4.jpg';
import fifthPhoto from '../assets/img/tour-img/grid-tour-5.jpg';
import sixthPhoto from '../assets/img/tour-img/grid-tour-6.jpg';
import sevenPhoto from '../assets/img/tour-img/grid-tour-7.jpg';
import eigthPhoto from '../assets/img/tour-img/grid-tour-8.jpg';
import '../pages/Main.css';

const MainSection7 = () => {
  return (
    <main className="main-7">
      <section className="main-7__content">
        <div className="main-7__content__title">
          <h3 className="main-7__content__title__heading">Our Gallery</h3>
          <p className="main-7__content__title__paragraph">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Volutpat elit sed pretium, egestas sed sit.</p>
        </div>
        <button className="main-7__content__btn">Open Instagram</button>
      </section>
      <section className="main-7__gallery">
        <div className="cell cell-1">
          <img src={firstPhoto} alt="urban landscape" />
        </div>
        <div className="cell cell-2">
          <img src={secPhoto} alt="urban landscape" />
        </div>
        <div className="cell cell-3">
          <img src={thirdPhoto} alt="urban landscape" />
        </div>
        <div className="cell cell-4">
        <img src={fourthPhoto} alt="urban landscape" />
        </div>
        <div className="cell cell-5">
        <img src={fifthPhoto} alt="urban landscape" />
        </div>
        <div className="cell cell-6">
        <img src={sixthPhoto} alt="urban landscape" />
        </div>
        <div className="cell cell-7">
        <img src={sevenPhoto} alt="urban landscape" />
        </div>
        <div className="cell cell-8">
        <img src={eigthPhoto} alt="urban landscape" />
        </div>
      </section>
    </main>
  )
}

export default MainSection7