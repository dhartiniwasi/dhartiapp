package com.startapp.simple.bloomfilter.version;

/* compiled from: Sta */
public enum BloomVersion {
    ZERO("0", 1, 720),
    THREE("3.0", 1, 720) {
    },
    FOUR("4", 3, 3500),
    FIVE("5", 3, 1000000);
    
    private final int numberOfHashes;
    private final int sizeOfBucket;
    private final String version;

    /* renamed from: a */
    public int mo31268a() {
        return this.numberOfHashes;
    }

    /* renamed from: b */
    public int mo31269b() {
        return this.sizeOfBucket;
    }

    /* renamed from: c */
    public String mo31270c() {
        return this.version;
    }

    /* access modifiers changed from: public */
    BloomVersion(String str, int i, int i2) {
        this.version = str;
        this.numberOfHashes = i;
        this.sizeOfBucket = i2;
    }
}
