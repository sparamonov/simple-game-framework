<script>
export default {
    props: {
        room: {
            type: Object,
            required: true
        }
    }
}
</script>

<template>
    <div class="pan">
        <b-card
            v-bind:title="room.name"
            style="max-width: 20rem;"
            class="mb-2"
        >
            <b-card-text>
                {{room}}
            </b-card-text>

            <b-button href="#" variant="primary">Go to room</b-button>
        </b-card>
    </div>
</template>