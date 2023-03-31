package p343rc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: rc.l */
/* compiled from: Codec */
public interface C12346l extends C12357n, C12398u {

    /* renamed from: rc.l$a */
    /* compiled from: Codec */
    public static final class C12347a implements C12346l {
        /* renamed from: a */
        public String mo37049a() {
            return "gzip";
        }

        /* renamed from: b */
        public InputStream mo37050b(InputStream inputStream) throws IOException {
            return new GZIPInputStream(inputStream);
        }

        /* renamed from: c */
        public OutputStream mo37051c(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* renamed from: rc.l$b */
    /* compiled from: Codec */
    public static final class C12348b implements C12346l {

        /* renamed from: a */
        public static final C12346l f45659a = new C12348b();

        private C12348b() {
        }

        /* renamed from: a */
        public String mo37049a() {
            return "identity";
        }

        /* renamed from: b */
        public InputStream mo37050b(InputStream inputStream) {
            return inputStream;
        }

        /* renamed from: c */
        public OutputStream mo37051c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
