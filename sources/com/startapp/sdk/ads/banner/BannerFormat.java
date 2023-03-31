package com.startapp.sdk.ads.banner;

/* compiled from: Sta */
public enum BannerFormat {
    BANNER(0, 320, 50),
    MREC(1, 300, 250),
    COVER(2, 1200, 628);
    
    public final int heightDp;
    public final int type;
    public final int widthDp;

    private BannerFormat(int i, int i2, int i3) {
        this.type = i;
        this.widthDp = i2;
        this.heightDp = i3;
    }
}
