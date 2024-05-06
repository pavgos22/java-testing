package com.crud.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.crud.tasks.mapper.TrelloMapper;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrelloMapperTest {

    private TrelloMapper trelloMapper;

    @BeforeEach
    public void init() {
        trelloMapper = new TrelloMapper();
    }

    @Test
    public void testMapToBoards() {
        // Given
        TrelloListDto listDto = new TrelloListDto("1", "ToDo", false);
        TrelloBoardDto boardDto = new TrelloBoardDto("1", "Test Board", List.of(listDto));

        // When
        List<TrelloBoard> mappedBoards = trelloMapper.mapToBoards(List.of(boardDto));

        // Then
        assertEquals(1, mappedBoards.size());
        assertEquals("Test Board", mappedBoards.get(0).getName());
        assertEquals("ToDo", mappedBoards.get(0).getLists().get(0).getName());
    }

    @Test
    public void testMapToBoardsDto() {
        // Given
        TrelloList list = new TrelloList("1", "Done", true);
        TrelloBoard board = new TrelloBoard("1", "Test Board", List.of(list));

        // When
        List<TrelloBoardDto> mappedBoardDtos = trelloMapper.mapToBoardsDto(List.of(board));

        // Then
        assertEquals(1, mappedBoardDtos.size());
        assertEquals("Test Board", mappedBoardDtos.get(0).getName());
        assertTrue(mappedBoardDtos.get(0).getLists().get(0).isClosed());
    }

    // Additional tests for the other public methods

    @Test
    public void testMapToList() {
        // Given
        TrelloListDto listDto = new TrelloListDto("1", "List One", true);

        // When
        List<TrelloList> mappedLists = trelloMapper.mapToList(List.of(listDto));

        // Then
        assertEquals(1, mappedLists.size());
        assertEquals("List One", mappedLists.get(0).getName());
        assertTrue(mappedLists.get(0).isClosed());
    }

    @Test
    public void testMapToListDto() {
        // Given
        TrelloList list = new TrelloList("1", "List One", true);

        // When
        List<TrelloListDto> mappedListDtos = trelloMapper.mapToListDto(List.of(list));

        // Then
        assertEquals(1, mappedListDtos.size());
        assertEquals("List One", mappedListDtos.get(0).getName());
        assertTrue(mappedListDtos.get(0).isClosed());
    }

    @Test
    public void testMapToCard() {
        // Given
        TrelloCardDto cardDto = new TrelloCardDto("Task 1", "Description", "top", "10");

        // When
        TrelloCard mappedCard = trelloMapper.mapToCard(cardDto);

        // Then
        assertEquals("Task 1", mappedCard.getName());
        assertEquals("Description", mappedCard.getDescription());
        assertEquals("top", mappedCard.getPos());
        assertEquals("10", mappedCard.getListId());
    }

    @Test
    public void testMapToCardDto() {
        // Given
        TrelloCard card = new TrelloCard("Task 1", "Description", "top", "10");

        // When
        TrelloCardDto mappedCardDto = trelloMapper.mapToCardDto(card);

        // Then
        assertEquals("Task 1", mappedCardDto.getName());
        assertEquals("Description", mappedCardDto.getDescription());
        assertEquals("top", mappedCardDto.getPos());
        assertEquals("10", mappedCardDto.getListId());
    }
}
