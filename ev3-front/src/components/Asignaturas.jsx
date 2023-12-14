import React, { useState, useEffect } from 'react';
import Navbar from './Navbar';
import './Asignaturas.css'; 
import { Link } from 'react-router-dom';

const Asignaturas = () => {
  const [asignaturas, setAsignaturas] = useState([]);
  const [filtro, setFiltro] = useState('');

  useEffect(() => {
    // Realizar la solicitud a la API para obtener todas las asignaturas
    fetch('http://localhost:8090/asignaturas')
      .then(response => response.json())
      .then(data => setAsignaturas(data))
      .catch(error => console.error('Error al obtener asignaturas:', error));
  }, []);

  const filtrarAsignaturas = () => {
    return asignaturas.filter(asignatura => {
      return asignatura.nombreasig.toLowerCase().includes(filtro.toLowerCase()) ||
             asignatura.codasig.toString().includes(filtro);
    });
  };

  return (
    <div>
      <Navbar />
      <div className="lista-estudiantes" align="center">
        <h2>LISTA DE ASIGNATURAS</h2>
        
        {asignaturas.length > 0 ? (
          <ul>
            <li className="cabecera">
              <span>CÓDIGO</span>
              <span>NOMBRE</span>
            </li>
            {asignaturas.map((asignatura) => (
              <li key={asignatura.codasig} className="datos-estudiante">
                <span>{asignatura.codasig}</span>
                <span>{asignatura.nombreasig}</span>
              </li>
            ))}
          </ul>
        ) : (
          <p>No se encontraron resultados.</p>
        )}
      </div>
    </div>
  );
};

export default Asignaturas;