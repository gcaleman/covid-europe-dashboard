import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import './App.css';
import { CountryDetailPage } from './pages/ContryDetailPage';
import { CountriesPage } from './pages/CountriesPage';

function App() {
  return (
    <div className="App">
      <Router>
        <Switch>
          <Route path="/:countryName">
            <CountryDetailPage />
          </Route>
          <Route path="/">
            <CountriesPage />
          </Route>
        </Switch>
      </Router>
    </div>
  );
}

export default App;
