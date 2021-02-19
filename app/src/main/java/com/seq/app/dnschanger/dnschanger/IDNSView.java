package com.seq.app.dnschanger.dnschanger;

import com.seq.app.dnschanger.model.DNSModel;

public interface IDNSView {
    void changeStatus(int serviceStatus);

    void setServiceInfo(DNSModel model);
}
