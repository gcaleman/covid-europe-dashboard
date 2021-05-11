import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import './App.css';
import { Footer } from './components/Footer';
import { NavigationBar } from './components/NavigationBar';
import { CountryDetailPage } from './pages/ContryDetailPage';
import { CountriesPage } from './pages/CountriesPage';

function App() {
  return (
    <div className="App">
      <NavigationBar />
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
      <Footer />
    </div>
  );
}

export default App;
