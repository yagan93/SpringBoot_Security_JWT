package com.example.jwt.domain.role.dto;

import com.example.jwt.domain.authority.Authority;
import com.example.jwt.domain.authority.dto.AuthorityDTO;
import com.example.jwt.domain.role.Role;
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
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role fromDTO(RoleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( dto.getId() );
        role.setName( dto.getName() );
        role.setAuthorities( authorityDTOSetToAuthoritySet( dto.getAuthorities() ) );

        return role;
    }

    @Override
    public List<Role> fromDTOs(List<RoleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( dtos.size() );
        for ( RoleDTO roleDTO : dtos ) {
            list.add( fromDTO( roleDTO ) );
        }

        return list;
    }

    @Override
    public Set<Role> fromDTOs(Set<RoleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Role> set = LinkedHashSet.newLinkedHashSet( dtos.size() );
        for ( RoleDTO roleDTO : dtos ) {
            set.add( fromDTO( roleDTO ) );
        }

        return set;
    }

    @Override
    public RoleDTO toDTO(Role BO) {
        if ( BO == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( BO.getId() );
        roleDTO.setName( BO.getName() );
        roleDTO.setAuthorities( authoritySetToAuthorityDTOSet( BO.getAuthorities() ) );

        return roleDTO;
    }

    @Override
    public List<RoleDTO> toDTOs(List<Role> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<RoleDTO> list = new ArrayList<RoleDTO>( BOs.size() );
        for ( Role role : BOs ) {
            list.add( toDTO( role ) );
        }

        return list;
    }

    @Override
    public Set<RoleDTO> toDTOs(Set<Role> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<RoleDTO> set = LinkedHashSet.newLinkedHashSet( BOs.size() );
        for ( Role role : BOs ) {
            set.add( toDTO( role ) );
        }

        return set;
    }

    protected Authority authorityDTOToAuthority(AuthorityDTO authorityDTO) {
        if ( authorityDTO == null ) {
            return null;
        }

        Authority authority = new Authority();

        authority.setId( authorityDTO.getId() );
        authority.setName( authorityDTO.getName() );

        return authority;
    }

    protected Set<Authority> authorityDTOSetToAuthoritySet(Set<AuthorityDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Authority> set1 = LinkedHashSet.newLinkedHashSet( set.size() );
        for ( AuthorityDTO authorityDTO : set ) {
            set1.add( authorityDTOToAuthority( authorityDTO ) );
        }

        return set1;
    }

    protected AuthorityDTO authorityToAuthorityDTO(Authority authority) {
        if ( authority == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( authority.getId() );
        authorityDTO.setName( authority.getName() );

        return authorityDTO;
    }

    protected Set<AuthorityDTO> authoritySetToAuthorityDTOSet(Set<Authority> set) {
        if ( set == null ) {
            return null;
        }

        Set<AuthorityDTO> set1 = LinkedHashSet.newLinkedHashSet( set.size() );
        for ( Authority authority : set ) {
            set1.add( authorityToAuthorityDTO( authority ) );
        }

        return set1;
    }
}
