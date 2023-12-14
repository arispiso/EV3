// components/Home.js
import React from 'react';
import Navbar from './Navbar';
import './Home.css'; // Archivo de estilos CSS

const Home = () => {
  return (
    <div>
      <Navbar />
      <div className="content">
        <div className="title">
          <h2 align="center">Bienvenido!</h2>
        </div>
        <section className="noticias">
          <p>
            Mi nombre es Aritz Lamelas y este será mi último proyecto de la asignatura de TINGESO.
          </p>
        </section>

        <section className="noticias">
          <p>
            En esta última evaluación, se ha pedido diseñar e implementar una aplicación web que permita gestionar el proceso
            de inscripción de asignaturas de los alumnos de las diferentes carreras (tanto de Civil como
            de Ejecución) de la Facultad de Ingeniería de la Universidad de Santiago.
          </p>
        </section>

        <section className="noticias">
          <p>
            A pesar de no haber podido completar el proyecto con todas sus funcionalidades, 
            me llevo un buen recuerdo de esta asignatura y de los compañeros. ¡Ha sido una experiencia inolvidable, 
            espero volver a vernos pronto! :)
          </p>
        </section>

      </div>
    </div>
  );
};

export default Home;