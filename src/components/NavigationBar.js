import React from 'react';
import { Container, Navbar, Row, Col } from 'react-bootstrap';
import './NavigationBar.css';

export const NavigationBar = () => (
  <Navbar className="navbar" sticky="top">
    <Container>
      <Row>
        <Navbar.Brand href="/" style={{ color: '#fff', textAlign: 'center' }}><h3> COVID DATA CHARTS</h3></Navbar.Brand>
      </Row>
    </Container>
  </Navbar>
)