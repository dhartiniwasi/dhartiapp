package com.unity3d.scar.adapter.common;

/* renamed from: com.unity3d.scar.adapter.common.l */
/* compiled from: WebViewAdsError */
public class C9706l implements C9702i {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public C9706l(Enum<?> enumR, String str, Object... objArr) {
        this._errorCategory = enumR;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
