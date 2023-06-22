import React from 'react'
import '../pages/Tour.css';

const TourSection3 = () => {
  return (
    <main className="main-3-photos">
        <div className="main-3__heading-wrapper">
          <h3 className="main-3__heading">Photo Of Places In Tour</h3>
          <div className="main-3__actions">
            <button className="scroll-btn prev-btn" onclick="scrollLeft()">&lt;</button>
          <button className="scroll-btn next-btn" onclick="scrollRight()">&gt;</button>
          </div>
        </div>
        <div className="main-3__tour-container">
          <div className="tour-places-photos">
           
          </div>
          <div className="tour-places-photos">
           
          </div>
          <div className="tour-places-photos">
           
          </div>
          <div className="tour-places-photos">
           
          </div>
          <div className="tour-places-photos">
           
          </div>
        </div>
    </main>
  )
}

export default TourSection3