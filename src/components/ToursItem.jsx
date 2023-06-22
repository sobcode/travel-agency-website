import { Link } from 'react-router-dom';
import '../pages/Tours.css';

const ToursItem = ({tour, classname, isDisplayBtn}) => {
    const price = tour.price.toFixed(2);
  return (
    <div className={`main-tours__item ${classname}`}>
            <div className="item__photo">

            </div>
            <h5 className="item__heading">{tour.title}</h5>
            <ul className="item__features">
                <li className="tour-destination">{tour.destination}</li>
                <li className="tour-durability">{tour.durability} days</li>
                <li className="tour-rating">{tour.rating} / 5 <i className="fa-solid fa-star"></i></li>
            </ul>
            <div className="item-actions">
                {isDisplayBtn && <Link to={`${tour.id}`}>
                    <button className="tour-learn-btn">Learn More</button>
                </Link>}
                <div className="tour-price">
                    <p>Price</p>
                    <span>{price}$</span>
                </div>
            </div>
        </div>
  )
}

export default ToursItem