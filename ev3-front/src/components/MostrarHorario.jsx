// MostrarHorarios.jsx

import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Navbar from './Navbar';
import './MostrarHorario.css'; // Asegúrate de importar tu archivo CSS

const MostrarHorarios = () => {
  const [horarios, setHorarios] = useState([]);

  useEffect(() => {
    // Realiza una solicitud al servidor para obtener los horarios de las asignaturas
    const fetchHorarios = async () => {
      try {
        const response = await axios.get('http://localhost:8090/horarios'); // Ajusta la URL según tu endpoint
        setHorarios(response.data); // Supongamos que response.data es un array de horarios
      } catch (error) {
        console.error('Error al obtener los horarios:', error);
      }
    };

    fetchHorarios();
  }, []); // Ejecutar solo una vez al montar el componente

  
  return (
    <div>
      <Navbar />
      <div className="container">
      <div className="title-container">
        <h2 className="title">HORARIO</h2>
      </div>
      <div className="table-container">
        <table className="horarios-table">
          <thead>
            <tr>
              <th>Asignatura</th>
              <th>Código de la asignatura</th>
              <th>Día</th>
              <th>Bloque</th>
              <th>Hora inicio</th>
              <th>Hora fin</th>
            </tr>
          </thead>
          <tbody>
            {horarios.map((horario) => (
              <tr key={horario.id}>
                <td>{horario.asignatura.nombreasig}</td>
                <td>{horario.asignatura.codasig}</td>
                <td>{horario.dia}</td>
                <td>{horario.modulo}</td>
                <td>{horario.hora_inicio}</td>
                <td>{horario.hora_final}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  </div>
  );
};

export default MostrarHorarios;
