package com.crud.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import com.crud.tasks.mapper.TrelloMapper;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrelloMapperTest {

    @InjectMocks
    private TrelloMapper trelloMapper;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testMapToBoards() {
        // Given
        TrelloListDto listDto = new TrelloListDto("1", "ToDo", false);
        TrelloBoardDto boardDto = new TrelloBoardDto("1", "Test Board", Arrays.asList(listDto));

        // When
        List<TrelloBoard> mappedBoards = trelloMapper.mapToBoards(Arrays.asList(boardDto));

        // Then
        assertEquals(1, mappedBoards.size());
        assertEquals("Test Board", mappedBoards.get(0).getName());
        assertEquals("ToDo", mappedBoards.get(0).getLists().get(0).getName());
    }

    @Test
    public void testMapToBoardsDto() {
        // Given
        TrelloList list = new TrelloList("1", "Done", true);
        TrelloBoard board = new TrelloBoard("1", "Test Board", Arrays.asList(list));

        // When
        List<TrelloBoardDto> mappedBoardDtos = trelloMapper.mapToBoardsDto(Arrays.asList(board));

        // Then
        assertEquals(1, mappedBoardDtos.size());
        assertEquals("Test Board", mappedBoardDtos.get(0).getName());
        assertEquals("Done", mappedBoardDtos.get(0).getLists().get(0).getName());
        assertTrue(mappedBoardDtos.get(0).getLists().get(0).isClosed());
    }
}

