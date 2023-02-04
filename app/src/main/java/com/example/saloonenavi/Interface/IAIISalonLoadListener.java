package com.example.saloonenavi.Interface;

import java.util.List;

public interface IAIISalonLoadListener {

    void onAllSalonLoadSuccess(List<String> areaNameList);
    void onAllSalonLoadFailed(String message);


}
