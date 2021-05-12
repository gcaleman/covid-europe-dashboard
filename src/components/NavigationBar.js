import React from 'react';
import { Container, Navbar, Row, Col } from 'react-bootstrap';

export const NavigationBar = () => (
  <Navbar bg="light" variant="dark" sticky="top">
    <Container>
      <Row>
        <Navbar.Brand href="/" style={{ color: 'black', textAlign: 'center' }}><h3> COVID DATA CHARTS</h3></Navbar.Brand>
      </Row>
    </Container>
  </Navbar>
)