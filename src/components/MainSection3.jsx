import React from 'react'
import TourItem from './ToursItem'
import '../pages/Main.css';

const MainSection3 = ({tours}) => {
  return (
    <main className="main-3">
      <div className="main-3__heading-wrapper">
        <h3 className="main-3__heading">Tours & Voyages</h3>
        <div className="main-3__actions">
          <button className="scroll-btn prev-btn" onclick="scrollLeft()">&lt;</button>
        <button className="scroll-btn next-btn" onclick="scrollRight()">&gt;</button>
        </div>
      </div>
      <div className='main-3__tours-container'>
      {
        tours.map(tourItem => <TourItem tour={tourItem} classname='tour' isDisplayBtn={false}/>)
      }
      </div>
      
</main>
  )
}

export default MainSection3