import React from 'react';
import './App.css';

function callApi() {
  fetch('http://localhost:8081/hello', { method: 'GET' })
  
}

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <button onClick={callApi}>say hello</button>
      </header>
    </div>
  );
}

export default App;
