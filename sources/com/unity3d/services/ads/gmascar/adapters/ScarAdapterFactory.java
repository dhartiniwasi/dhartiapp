package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.C9695b;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9699f;
import com.unity3d.services.core.log.DeviceLog;
import p194bb.C6731a;
import p223eb.C10024a;
import p407ya.C13242a;

public class ScarAdapterFactory {
    public static final int CODE_19_2 = 201604000;
    public static final int CODE_19_5 = 203404000;
    public static final int CODE_19_8 = 204890000;
    public static final int CODE_20_0 = 210402000;

    public C9699f createScarAdapter(long j, C9697d dVar) {
        if (j >= 210402000) {
            return new C10024a(dVar);
        }
        if (j >= 203404000 && j <= 204890000) {
            return new C6731a(dVar);
        }
        if (j >= 201604000) {
            return new C13242a(dVar);
        }
        String format = String.format("SCAR version %s is not supported.", new Object[]{Long.valueOf(j)});
        dVar.handleError(C9695b.m50613b(format));
        DeviceLog.debug(format);
        return null;
    }
}
