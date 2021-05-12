import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import './App.css';
import { Footer } from './components/Footer';
import { NavigationBar } from './components/NavigationBar';
import { CountryDetailPage } from './pages/ContryDetailPage';
import { CountriesPage } from './pages/CountriesPage';
import { SelectContinent } from './pages/SelectContinent';

function App() {
  return (
    <div className="App">
      <NavigationBar />
      <Router>
        <Switch>
          <Route path="/country/:countryName">
            <CountryDetailPage />
          </Route>
          <Route path="/europe">
            <CountriesPage />
          </Route>
          <Route path="/">
            <SelectContinent />
          </Route>
        </Switch>
      </Router>
      <Footer />
    </div>
  );
}

export default App;
