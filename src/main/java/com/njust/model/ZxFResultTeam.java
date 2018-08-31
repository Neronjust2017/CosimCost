package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFResultTeam implements Serializable {
    private BigDecimal vsId;

    private BigDecimal staId;

    private BigDecimal teamId;

    private BigDecimal utilizationRatio;

    private Long workingHour;

    private static final long serialVersionUID = 1L;

    public BigDecimal getVsId() {
        return vsId;
    }

    public void setVsId(BigDecimal vsId) {
        this.vsId = vsId;
    }

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
    }

    public BigDecimal getTeamId() {
        return teamId;
    }

    public void setTeamId(BigDecimal teamId) {
        this.teamId = teamId;
    }

    public BigDecimal getUtilizationRatio() {
        return utilizationRatio;
    }

    public void setUtilizationRatio(BigDecimal utilizationRatio) {
        this.utilizationRatio = utilizationRatio;
    }

    public Long getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(Long workingHour) {
        this.workingHour = workingHour;
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
        ZxFResultTeam other = (ZxFResultTeam) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getTeamId() == null ? other.getTeamId() == null : this.getTeamId().equals(other.getTeamId()))
            && (this.getUtilizationRatio() == null ? other.getUtilizationRatio() == null : this.getUtilizationRatio().equals(other.getUtilizationRatio()))
            && (this.getWorkingHour() == null ? other.getWorkingHour() == null : this.getWorkingHour().equals(other.getWorkingHour()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        result = prime * result + ((getUtilizationRatio() == null) ? 0 : getUtilizationRatio().hashCode());
        result = prime * result + ((getWorkingHour() == null) ? 0 : getWorkingHour().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vsId=").append(vsId);
        sb.append(", staId=").append(staId);
        sb.append(", teamId=").append(teamId);
        sb.append(", utilizationRatio=").append(utilizationRatio);
        sb.append(", workingHour=").append(workingHour);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}