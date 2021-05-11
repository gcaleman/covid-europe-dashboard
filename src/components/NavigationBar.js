import React from 'react';
import { Container, Navbar, Row, Col } from 'react-bootstrap';

export const NavigationBar = () => (
  <Navbar bg="light" variant="dark" sticky="top">
    <Container>
      <Row>
        <Col md={2}>
          <img
            src="/logos/European_Union_logo.png"
            width="35"
            height="30"
            className="d-inline-block align-top icon"
            alt=""
          />
        </Col>
        <Col md={10}>
          <Navbar.Brand href="/" style={{ color: 'black', textAlign: 'center' }}><h4> COVID DATA - EUROPEAN COUNTRIES</h4></Navbar.Brand>
        </Col>
      </Row>
    </Container>
  </Navbar>
)