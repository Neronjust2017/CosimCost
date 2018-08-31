package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFTeam implements Serializable {
    private BigDecimal fTeamId;

    private BigDecimal staId;

    private BigDecimal teamLevel;

    private BigDecimal teamEffi;

    private BigDecimal teamNumber;

    private BigDecimal vsId;

    private String teamName;

    private static final long serialVersionUID = 1L;

    public BigDecimal getfTeamId() {
        return fTeamId;
    }

    public void setfTeamId(BigDecimal fTeamId) {
        this.fTeamId = fTeamId;
    }

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
    }

    public BigDecimal getTeamLevel() {
        return teamLevel;
    }

    public void setTeamLevel(BigDecimal teamLevel) {
        this.teamLevel = teamLevel;
    }

    public BigDecimal getTeamEffi() {
        return teamEffi;
    }

    public void setTeamEffi(BigDecimal teamEffi) {
        this.teamEffi = teamEffi;
    }

    public BigDecimal getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(BigDecimal teamNumber) {
        this.teamNumber = teamNumber;
    }

    public BigDecimal getVsId() {
        return vsId;
    }

    public void setVsId(BigDecimal vsId) {
        this.vsId = vsId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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
        ZxFTeam other = (ZxFTeam) that;
        return (this.getfTeamId() == null ? other.getfTeamId() == null : this.getfTeamId().equals(other.getfTeamId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getTeamLevel() == null ? other.getTeamLevel() == null : this.getTeamLevel().equals(other.getTeamLevel()))
            && (this.getTeamEffi() == null ? other.getTeamEffi() == null : this.getTeamEffi().equals(other.getTeamEffi()))
            && (this.getTeamNumber() == null ? other.getTeamNumber() == null : this.getTeamNumber().equals(other.getTeamNumber()))
            && (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getTeamName() == null ? other.getTeamName() == null : this.getTeamName().equals(other.getTeamName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getfTeamId() == null) ? 0 : getfTeamId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getTeamLevel() == null) ? 0 : getTeamLevel().hashCode());
        result = prime * result + ((getTeamEffi() == null) ? 0 : getTeamEffi().hashCode());
        result = prime * result + ((getTeamNumber() == null) ? 0 : getTeamNumber().hashCode());
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getTeamName() == null) ? 0 : getTeamName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fTeamId=").append(fTeamId);
        sb.append(", staId=").append(staId);
        sb.append(", teamLevel=").append(teamLevel);
        sb.append(", teamEffi=").append(teamEffi);
        sb.append(", teamNumber=").append(teamNumber);
        sb.append(", vsId=").append(vsId);
        sb.append(", teamName=").append(teamName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}