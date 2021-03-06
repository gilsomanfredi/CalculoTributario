/* 
 * The MIT License
 *
 * Copyright 2017 Chronusinfo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.chronos.calc.resultados.imp;

import com.chronos.calc.resultados.IResultadoCalculoIcmsSt;
import java.math.BigDecimal;

/**
 *
 * @author John Vanderson M L
 */
public class ResultadoCalculoIcmsSt implements IResultadoCalculoIcmsSt {

    private final BigDecimal baseCalculoOperacaoPropria;
    private final BigDecimal valorIcmsProprio;
    private final BigDecimal baseCalculoIcmsSt;
    private final BigDecimal valorIcmsSt;

    public ResultadoCalculoIcmsSt(BigDecimal baseCalculoOperacaoPropria, BigDecimal valorIcmsProprio, BigDecimal baseCalculoIcmsSt, BigDecimal valorIcmsSt) {
        this.baseCalculoOperacaoPropria = baseCalculoOperacaoPropria;
        this.valorIcmsProprio = valorIcmsProprio;
        this.baseCalculoIcmsSt = baseCalculoIcmsSt;
        this.valorIcmsSt = valorIcmsSt;
    }

    @Override
    public BigDecimal getBaseCalculoOperacaoPropria() {
        return baseCalculoOperacaoPropria;
    }

    @Override
    public BigDecimal getValorIcmsProprio() {
        return valorIcmsProprio;
    }

    @Override
    public BigDecimal getBaseCalculoIcmsSt() {
        return baseCalculoIcmsSt;
    }

    @Override
    public BigDecimal getValorIcmsSt() {
        return valorIcmsSt;
    }

}
