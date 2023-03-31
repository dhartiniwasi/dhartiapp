package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C7105o7;
import com.google.android.gms.internal.measurement.C7121p7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C7121p7<MessageType extends C7121p7<MessageType, BuilderType>, BuilderType extends C7105o7<MessageType, BuilderType>> implements C7092na {
    protected int zzb = 0;

    /* renamed from: g */
    protected static void m40558g(Iterable iterable, List list) {
        C7107o9.m40532e(iterable);
        if (iterable instanceof C7203u9) {
            List U = ((C7203u9) iterable).mo23886U();
            C7203u9 u9Var = (C7203u9) list;
            int size = list.size();
            for (Object next : U) {
                if (next == null) {
                    int size2 = u9Var.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = u9Var.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            u9Var.remove(size3);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof C6977g8) {
                    u9Var.mo23885P0((C6977g8) next);
                } else {
                    u9Var.add((String) next);
                }
            }
        } else if (!(iterable instanceof C7204ua)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 >= size4) {
                            list.remove(size6);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: a */
    public final C6977g8 mo23699a() {
        try {
            int d = mo23488d();
            C6977g8 g8Var = C6977g8.f31702b;
            byte[] bArr = new byte[d];
            C7106o8 c = C7106o8.m40504c(bArr);
            mo23486b(c);
            c.mo23725d();
            return new C6926d8(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo23491f(C7268ya yaVar) {
        throw null;
    }

    /* renamed from: h */
    public final byte[] mo23736h() {
        try {
            byte[] bArr = new byte[mo23488d()];
            C7106o8 c = C7106o8.m40504c(bArr);
            mo23486b(c);
            c.mo23725d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
