import React from 'react'
import '../pages/Main.css';

const MainSection1 = () => {
  return (
    <main className="main-1">
      <section className="main-1__left"></section>
      <section className="main-1__right">
        <h3 className="main-1__right__heading">Ordinary Best Western 5 Stars Travel Agency Since 1998</h3>
        <p className="main-1__right__paragraph">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Volutpat elit sed pretium, egestas sed sit. Fames tincidunt rhoncus viverra eu ut scelerisque. Erat orci scelerisque adipiscing potenti sollicitudin semper aliquam in ultricies. Sem vitae amet, egestas aliquam mi a arcu. Feugiat at dignissim massa ornare. Platea eu orci enim est egestas fusce cras. <br/>Purus diam est vitae faucibus enim. Ultricies nunc vel magnis gravida quis sodales. Lacus, elit pellentesque massa odio. Sed dictumst condimentum sit quis </p>
        <button className="main-1__right__btn">Learn More {'>>'} </button>
        </section>
    </main>
  )
}

export default MainSection1