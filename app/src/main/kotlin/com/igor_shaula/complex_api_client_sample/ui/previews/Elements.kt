package com.igor_shaula.complex_api_client_sample.ui.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.igor_shaula.complex_api_client_sample.R
import com.igor_shaula.complex_api_client_sample.ui.elements.main_screen_content.CustomizedSearchBar
import com.igor_shaula.complex_api_client_sample.ui.elements.main_screen_content.CustomizedSearchBarAlternative
import com.igor_shaula.complex_api_client_sample.ui.elements.main_screen_content.TheAppTopBar
import com.igor_shaula.complex_api_client_sample.ui.elements.main_screen_content.TheUiCard
import com.igor_shaula.complex_api_client_sample.ui.models.TheUiModel

@DayNightPreviews
@Composable
fun TheAppTopBarPreview() {
    ThemeWithSurfaceElement {
        TheAppTopBar(
            searchQuery = stringResource(id = R.string.searchFieldHint),
        ) { _, _ -> }
    }
}

@DayNightPreviews
@Composable
fun CustomizedSearchBarPreview() {
    ThemeWithSurfaceElement {
        CustomizedSearchBar(
            searchQuery = stringResource(id = R.string.searchFieldHint),
            handleSearchQuery = { _ -> })
    }
}

@DayNightPreviews
@Composable
fun CustomizedSearchBarAlternativePreview() {
    ThemeWithSurfaceElement {
        CustomizedSearchBarAlternative(
            searchQuery = stringResource(id = R.string.searchFieldHint),
            handleSearchQuery = { _, _ -> })
    }
}

@DayNightPreviews
@Composable
fun TheUiCardPreview() {
    ThemeWithSurfaceElement {
        TheUiCard(theUiModel = TheUiModel("image", "name"))
    }
}
