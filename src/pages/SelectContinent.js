import { React } from 'react';
import { Container, Col, Row } from 'react-bootstrap';
import { Link } from 'react-router-dom';

export const SelectContinent = () => {

    return (
        <div className="SelectContinent">
            <Container>
                <Row style={{paddingTop: '100px', paddingBottom:'50px'}}>
                    <Col md={4}>
                    </Col>
                    <Col md={4}>
                        <Link to="/country/Brazil"><h2 style={{ textAlign: 'center' }}>Brazil</h2></Link>
                    </Col>
                </Row>
                <hr></hr>
                <Row style={{paddingTop: '50px'}}>
                    <Col md={4}>
                    </Col>
                    <Col md={4}>
                        <Link to="/europe"><h2 style={{ textAlign: 'center' }}>Europe</h2></Link>
                    </Col>
                </Row>
            </Container>
        </div>
    )
}