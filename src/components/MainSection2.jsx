import {useState, useEffect} from 'react'


const MainSection2 = () => {
  const [date, setDate] = useState(new Date());

  useEffect(() => {
    const interval = setInterval(() => {
      setDate(new Date());
    }, 1000);

    return () => {
      clearInterval(interval);
    }
  }, []);
  
  return (
    <main className="main-2-div">
      <div className="main-2__date">
        <div className="main-2__date__photo"></div>
        <p className="main-2__date__paragraph">Today Date</p>
        <h3 className="main-2__date__heading">{date.getDate()}.{date.getMonth() + 1}.{date.getFullYear()}</h3>
      </div>
      <div className="main-2__date">
        <div className="main-2__date__photo"></div>
        <p className="main-2__date__paragraph">Current Time</p>
        <h3 className="main-2__date__heading">{date.getHours()}:{date.getMinutes()}:{date.getSeconds()}</h3>
      </div>
      <div className="main-2__date">
        <div className="main-2__date__photo"></div>
        <p className="main-2__date__paragraph">Temperature Weather</p>
        <h3 className="main-2__date__heading">14 &#176; C</h3>
      </div>
    </main>
  )
}

export default MainSection2