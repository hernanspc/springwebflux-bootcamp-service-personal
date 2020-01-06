package com.springwebflux.bootcamp.service.personal.app.convertion;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.springwebflux.bootcamp.service.personal.app.model.CountSaving;
import com.springwebflux.bootcamp.service.personal.app.model.Personal;
import com.springwebflux.bootcamp.service.personal.app.model.dto.PersonalDto; 
@Component
public class ConvertPersonal {
	public Personal toPersonal(Personal personalDto){
        List<CountSaving> list = new ArrayList<>();
        Personal personal = new Personal();
        CountSaving countSaving = new CountSaving();
        countSaving.setIdCountSaving(personalDto.getId());
        list.add(countSaving);
 
        personal.setCreateAt(personalDto.getCreateAt());
        personal.setUpdateAt(personalDto.getUpdateAt());
        personal.setTypeDoc(personalDto.getTypeDoc());
        personal.setNumDoc(personalDto.getNumDoc());
        personal.setCountSavingList(list);
        return personal;
	}
}
