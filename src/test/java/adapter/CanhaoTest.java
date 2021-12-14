package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanhaoTest {

    @Test
    void deveRetornarAngulacaoDoCanhaoEmRadiano() {
        Canhao canhao = new Canhao();
        canhao.setAngulo(2);

        assertEquals(2, canhao.getAngulo());
    }

    @Test
    void deveRetornarAngulacaoDoCanhaoEmGrau() {
        Canhao canhao = new Canhao();
        canhao.setAngulo(30);

        assertEquals(0.5233333333333334, canhao.getGrau());
    }
}