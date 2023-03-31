package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.startapp.d7 */
/* compiled from: Sta */
public class C8912d7 extends C9152n8 {

    /* renamed from: a */
    public final Set<C8928e7> f36699a = new HashSet();

    /* renamed from: a */
    public void mo29310a(String str, Object obj, boolean z, boolean z2) throws SDKException {
        if (z && obj == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            try {
                C8928e7 e7Var = new C8928e7();
                e7Var.f36722a = str;
                String obj2 = obj.toString();
                if (z2) {
                    obj2 = URLEncoder.encode(obj2, "UTF-8");
                }
                e7Var.f36723b = obj2;
                if (!this.f36699a.add(e7Var)) {
                    this.f36699a.remove(e7Var);
                    this.f36699a.add(e7Var);
                }
            } catch (UnsupportedEncodingException e) {
                if (z) {
                    throw new SDKException(str, e);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        for (C8928e7 next : this.f36699a) {
            if (next.f36723b != null) {
                sb.append(next.f36722a);
                sb.append('=');
                sb.append(next.f36723b);
                sb.append('&');
            } else {
                Set<String> set = next.f36724c;
                if (set != null) {
                    for (String append : set) {
                        sb.append(next.f36722a);
                        sb.append('=');
                        sb.append(append);
                        sb.append('&');
                    }
                }
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().replace("+", "%20");
    }

    /* renamed from: a */
    public void mo29311a(String str, Set<String> set, boolean z, boolean z2) throws SDKException {
        if (z && set == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (set != null) {
            C8928e7 e7Var = new C8928e7();
            e7Var.f36722a = str;
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (z2) {
                    try {
                        next = URLEncoder.encode(next, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                hashSet.add(next);
            }
            if (!z || hashSet.size() != 0) {
                e7Var.f36724c = hashSet;
                if (!this.f36699a.add(e7Var)) {
                    this.f36699a.remove(e7Var);
                    this.f36699a.add(e7Var);
                    return;
                }
                return;
            }
            throw new SDKException(str, (Throwable) null);
        }
    }
}
