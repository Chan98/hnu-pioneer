package com.hnu.pioneer.dto;

import com.hnu.pioneer.domain.Member;
import com.hnu.pioneer.domain.Study;
import com.hnu.pioneer.domain.jointable.StudyMemberMapping;
import lombok.Builder;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class StudyMemberMappingDto {
    Long idx;
    private Member participant;
    private Study registeredStudy;

    @Builder
    public StudyMemberMappingDto(Long idx, Member participant, Study registeredStudy) {
        this.idx = idx;
        this.participant = participant;
        this.registeredStudy = registeredStudy;
    }

    public StudyMemberMapping toEntity() {
        return StudyMemberMapping.builder()
                .participant(participant)
                .registeredStudy(registeredStudy)
                .build();
    }
}
