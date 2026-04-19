package com.example.jwt.domain.authority.dto;

import com.example.jwt.domain.authority.Authority;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-19T23:28:03+0200",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-9.0.0.jar, environment: Java 21.0.8 (Microsoft)"
)
@Component
public class AuthorityMapperImpl implements AuthorityMapper {

    @Override
    public Authority fromDTO(AuthorityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Authority authority = new Authority();

        authority.setId( dto.getId() );
        authority.setName( dto.getName() );

        return authority;
    }

    @Override
    public List<Authority> fromDTOs(List<AuthorityDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Authority> list = new ArrayList<Authority>( dtos.size() );
        for ( AuthorityDTO authorityDTO : dtos ) {
            list.add( fromDTO( authorityDTO ) );
        }

        return list;
    }

    @Override
    public Set<Authority> fromDTOs(Set<AuthorityDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Authority> set = LinkedHashSet.newLinkedHashSet( dtos.size() );
        for ( AuthorityDTO authorityDTO : dtos ) {
            set.add( fromDTO( authorityDTO ) );
        }

        return set;
    }

    @Override
    public AuthorityDTO toDTO(Authority BO) {
        if ( BO == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( BO.getId() );
        authorityDTO.setName( BO.getName() );

        return authorityDTO;
    }

    @Override
    public List<AuthorityDTO> toDTOs(List<Authority> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<AuthorityDTO> list = new ArrayList<AuthorityDTO>( BOs.size() );
        for ( Authority authority : BOs ) {
            list.add( toDTO( authority ) );
        }

        return list;
    }

    @Override
    public Set<AuthorityDTO> toDTOs(Set<Authority> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<AuthorityDTO> set = LinkedHashSet.newLinkedHashSet( BOs.size() );
        for ( Authority authority : BOs ) {
            set.add( toDTO( authority ) );
        }

        return set;
    }
}
