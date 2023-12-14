// components/Navbar.js
import React from 'react';
import { Link } from 'react-router-dom';
import './Navbar.css'; // Archivo de estilos CSS

const Navbar = () => {
  const logoUrl = 'https://www.mem.dmcc.usach.cl/wp-content/uploads/2021/08/usach_dmcc.png';

  return (
    <div className="navbar">
      <div className="logo">
        
      </div>
      <div className="nav-links">
        <Link to="/lista-estudiantes">Lista de Estudiantes</Link>
        <Link to="/asignaturas">Lista de Asignaturas</Link>
        <Link to="/">Inscribir Asignaturas</Link>
        <Link to="/ingreso-horario">Ingresar Horario</Link>
        <Link to="/mostrar-horario">Mostrar Horario</Link>
        <Link to="/">Malla Interactiva</Link>
      </div>
      <div className="nav-links">
        <Link to="/">Menú principal</Link>
      </div>
    </div>
  );
};

export default Navbar;