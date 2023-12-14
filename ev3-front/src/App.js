import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './components/Home';
import ListaEstudiantes from './components/ListaEstudiantes';
import Asignaturas from './components/Asignaturas';
import IngresoHorario from './components/IngresoHorario';
import MostrarHorario from './components/MostrarHorario';


const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/lista-estudiantes" element={<ListaEstudiantes />} />
        <Route path="/asignaturas" element={<Asignaturas />} />
        <Route path="/ingreso-horario" element={<IngresoHorario />} />
        <Route path="/mostrar-horario" element={<MostrarHorario />} />
      </Routes>
    </Router>
  );
};

export default App;