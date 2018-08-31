package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxVariable implements Serializable {
    private BigDecimal no;

    private BigDecimal staPic;

    private static final long serialVersionUID = 1L;

    public BigDecimal getNo() {
        return no;
    }

    public void setNo(BigDecimal no) {
        this.no = no;
    }

    public BigDecimal getStaPic() {
        return staPic;
    }

    public void setStaPic(BigDecimal staPic) {
        this.staPic = staPic;
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
        ZxVariable other = (ZxVariable) that;
        return (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getStaPic() == null ? other.getStaPic() == null : this.getStaPic().equals(other.getStaPic()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getStaPic() == null) ? 0 : getStaPic().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", no=").append(no);
        sb.append(", staPic=").append(staPic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}