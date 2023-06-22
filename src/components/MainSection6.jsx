import React from 'react'
import urbanImg from '../assets/img/tour-img/urban-landscape-1.jpg';
import '../pages/Main.css';

const MainSection6 = () => {
  return (
    <main className="main-6">
      <section className="main-6__upper"></section>
      <section className="main-6__middle">
        <img src={urbanImg} alt="urban landscape" />
      </section>
      <section className="main-6__lower"></section>
    </main>
  )
}

export default MainSection6