package p155v3;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: v3.l */
/* compiled from: DataSource */
public interface C5828l extends C5819i {

    /* renamed from: v3.l$a */
    /* compiled from: DataSource */
    public interface C5829a {
        /* renamed from: a */
        C5828l mo20353a();
    }

    void close() throws IOException;

    /* renamed from: i */
    Map<String, List<String>> mo6816i();

    /* renamed from: m */
    Uri mo6817m();

    /* renamed from: n */
    void mo6818n(C5840p0 p0Var);

    /* renamed from: o */
    long mo6819o(C5837p pVar) throws IOException;
}
