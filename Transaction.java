package com.prabhat.blockchain;


public class Transaction {
    private String sourceName;
    private String destinatationName;
    private Long sum;



    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinatationName() {
        return destinatationName;
    }

    public void setDestinatationName(String destinatationName) {
        this.destinatationName = destinatationName;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Transaction(String sourceName, String destinatationName, Long sum) {
        this.sourceName = sourceName;
        this.destinatationName = destinatationName;
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null) return false;
        if (destinatationName != null ? !destinatationName.equals(that.destinatationName) : that.destinatationName != null)
            return false;
        return sum != null ? sum.equals(that.sum) : that.sum == null;
    }

    @Override
    public int hashCode() {
        int result = sourceName != null ? sourceName.hashCode() : 0;
        result = 31 * result + (destinatationName != null ? destinatationName.hashCode() : 0);
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        return result;
    }
}
