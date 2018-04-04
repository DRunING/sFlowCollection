package com.zendlee.sFlowC.repository.flowRecord;

// RawPacketFlow is a raw Ethernet header flow flowRecord.
public class RawPacketFlow {
    private int protocol;
    private int frameLength;
    private int stripped;
    private int headerSize;
    private byte[] header;


    public int getProtocol() {
        return protocol;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public int getFrameLength() {
        return frameLength;
    }

    public void setFrameLength(int frameLength) {
        this.frameLength = frameLength;
    }

    public int getStripped() {
        return stripped;
    }

    public void setStripped(int stripped) {
        this.stripped = stripped;
    }

    public int getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(int headerSize) {
        this.headerSize = headerSize;
    }

    public byte[] getHeader() {
        return header;
    }

    public void setHeader(byte[] header) {
        this.header = header;
    }
}