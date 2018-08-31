package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcCpi implements Serializable {
    /**
     * 年份
     */
    private String year;

    /**
     * CPI值
     */
    private BigDecimal cpivalue;

    private static final long serialVersionUID = 1L;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public BigDecimal getCpivalue() {
        return cpivalue;
    }

    public void setCpivalue(BigDecimal cpivalue) {
        this.cpivalue = cpivalue;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LlcCpi other = (LlcCpi) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCpivalue() == null ? other.getCpivalue() == null : this.getCpivalue().equals(other.getCpivalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCpivalue() == null) ? 0 : getCpivalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", year=").append(year);
        sb.append(", cpivalue=").append(cpivalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}