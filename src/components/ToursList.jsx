import React from 'react'
import ToursItem from './ToursItem';
import '../pages/Tours.css';

const ToursList = ({tours}) => {
  console.log('tourlist');
  console.log(tours);
  return (
    <main class="main-tours">
        {
          tours.map(tour => <ToursItem tour={tour} isDisplayBtn={true}/>)
        }
    </main>
  )
}

export default ToursList