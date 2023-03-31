package p271jc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6568r;
import p403y6.C13051b;

/* renamed from: jc.c */
/* compiled from: UserMessagingCodec */
public class C11554c extends C6568r {

    /* renamed from: d */
    private final Map<Integer, C13051b> f44025d = new HashMap();

    C11554c() {
    }

    /* renamed from: q */
    private List<String> m56482q(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object next : (List) obj) {
                if (next instanceof String) {
                    arrayList.add((String) next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo22176g(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case -127:
                return new C11553b((Boolean) mo22176g(byteBuffer.get(), byteBuffer), (C11552a) mo22176g(byteBuffer.get(), byteBuffer));
            case -126:
                return new C11552a((Integer) mo22176g(byteBuffer.get(), byteBuffer), m56482q(mo22176g(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.f44025d.get((Integer) mo22176g(byteBuffer.get(), byteBuffer));
            default:
                return super.mo22176g(b, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof C11553b) {
            byteArrayOutputStream.write(-127);
            C11553b bVar = (C11553b) obj;
            mo22177p(byteArrayOutputStream, bVar.mo35653c());
            mo22177p(byteArrayOutputStream, bVar.mo35652b());
        } else if (obj instanceof C11552a) {
            byteArrayOutputStream.write(-126);
            C11552a aVar = (C11552a) obj;
            mo22177p(byteArrayOutputStream, aVar.mo35647b());
            mo22177p(byteArrayOutputStream, aVar.mo35648c());
        } else if (obj instanceof C13051b) {
            byteArrayOutputStream.write(-125);
            mo22177p(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else {
            super.mo22177p(byteArrayOutputStream, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo35656r(C13051b bVar) {
        this.f44025d.remove(Integer.valueOf(bVar.hashCode()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo35657s(C13051b bVar) {
        this.f44025d.put(Integer.valueOf(bVar.hashCode()), bVar);
    }
}
